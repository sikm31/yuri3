/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author y.voytovich
 */
public class Director extends Direction {
    protected boolean order = false;
    
    @Override
    public void GetMoney(){}
    @Override
    public void RecieveMoney(){}
    @Override
    public void SellReklama(){}
    @Override
    public void CreateCatalog(){}
    @Override
    public void Reklama(){}
    
    public void Director(String name, String loation, String telephone){
    
    }
    public double GetMoney(double money){
    System.out.println("I'm a car, and I'm moving");
    double getmone = allmoney - money;
    return getmone;
    }

    public void RecieveMoney(double money){
    System.out.println("I'm a car, and I'm moving");
    recievemoney = money;
    //return recievemoney;
    }
    
    public void startOrder(){
		order = true;
	}
	
    public void stopOrder(){
		order = false;
	}
	
    public boolean isOrderToStarted(){
		return order;
	}
}
