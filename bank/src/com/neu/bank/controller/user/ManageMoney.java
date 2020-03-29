package com.neu.bank.controller.user;

import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;

/**
 * Servlet implementation class ManageMoney
 */
@WebServlet("/ManageMoney")
public class ManageMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageMoney() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String mark = request.getParameter("mark");
		String beginTime = request.getParameter("beginTime");
		String endTime = request.getParameter("endTime");
		String str= request.getParameter("money");
		double money = Double.parseDouble(str);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date begin = null;
		Date end = null;
		try {
			begin = df.parse(beginTime);
			end = df.parse(endTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double day = (end.getTime()-begin.getTime())/1000/60/60/24;//存/贷天数
		double year = day/365;//年
		double rate = 0.0;//利率
		double in = 0.0;//利息
		double interestMoney = 0.0;//本息总额
		List<Double> list = new ArrayList<Double>();
		if(mark.equals("deposit")){
			String save = request.getParameter("save");
			if(save.equals("1")){
				rate = 0.00385;
			}else if(save.equals("2")){
				if(year<1){
					rate = 0.013;
				}else if(year>=1&&year<3){
					rate = 0.021;
				}else if(year>=3){
					rate = 0.03;
				}
			}else {
				if(year<0){
					rate = 0.011;
				}else if(year>=1){
					rate = 0.013;
				}
			}
			
		}else if(mark.equals("loans")){
			if(year<1){
				rate = 0.0435;
			}else if(year<=3&&year>1){
				rate = 0.0475;
			}else {
				rate = 0.049;
			}
		}
		DecimalFormat d = new DecimalFormat( "0.00");
		in = (day*money*rate)/365;
		double interest = Double.parseDouble(d.format(in));
		interestMoney = interest+money;
		list.add(rate);
		list.add(interest);
		list.add(interestMoney);
		String jsonArr = JSONArray.toJSONString(list);
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().println(jsonArr);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
