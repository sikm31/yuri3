/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author y.voytovich
 */
abstract public class Twogis {
    protected String name;
    protected String location;
    protected String telephone;
    protected String email;
    protected String webadress;
    protected String site;
    double allmoney ;
    double recievemoney;
    
    abstract public void Reklama();
    abstract public void CreateCatalog();
    abstract public void SellReklama();
    abstract public void GetMoney();
    abstract public void RecieveMoney();
   
}
