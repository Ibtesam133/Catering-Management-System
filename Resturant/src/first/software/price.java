/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first.software;

import static first.software.Reserve_Page.Final_Recipt_Number;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author And
 */
public class price {
    
    
     public String channa_sela_r,channa_basmati_r,sela_biryani_r,basmait_biryani_r,tikka_biryani_r,yakhni_biryani_r,beef_bachya_hadi_r
             
            ,beef_bachya_bagair_hadi_r,beef_bara_hadi_r,beef_bara_bagair_hadi_r,qorma_r,karahi_r,white_karahi_r,tikka_karahi_r,achar_gohsht_r
             
            ,green_karahi_r,badami_qorma_r,kheer_r,rabri_kheer_r,custurd_r,labi_sheri_r,dodh_dulari_r,gajar_halwa_r,loki_halwa_r,
             
            gulab_jaman_r,soji_halwa_r,zarda_VIP_r,zarda_zafrani_r,zarda_normal_r,zarda_full_VIP_r,milk_roti_r,naan_roti_r,taftan_r,sheermal_r,
             
            cold_reg_r,cold_jambo_r,normanl_mineral_500_r,aqua_mineral_500_r,normanl_mineral_15_r,aqua_mineral_15_r,normal_salid_r,salid_kachomar_r,
             
            rusain_salid_r,raita_r,potato_r;
     
     
     
     public void price(){
    
         //price 
        try{  
       
     
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        
        Connection con = 
        DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=owaise;username=admin;password=admin");
        String a="0" ;
        PreparedStatement st = con.prepareStatement
        ("select * from price");
                      
             ResultSet rs = st.executeQuery();
             while(rs.next()){

                 if(rs.getString("item").equals("chana sela")){
                 channa_sela_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("chana basmati")){
                 channa_basmati_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("yakhni pilao ")){
                 yakhni_biryani_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("sela biryani")){
                 sela_biryani_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("basmati biryani")){
                 basmait_biryani_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("tikka biryani")){
                 tikka_biryani_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("beef bachya hadi")){
                 beef_bachya_hadi_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("beef bachya bagair  hadi")){
                 beef_bachya_bagair_hadi_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("beef bara hadi")){
                 beef_bara_hadi_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("beef bara bagair hadi")){
                 beef_bara_bagair_hadi_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("qorma")){
                 qorma_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("karahi")){
                 karahi_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("white karahi")){
                 white_karahi_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("tikka karahi")){
                 tikka_karahi_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("achar ghosht")){
                 achar_gohsht_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("green karahi")){
                 green_karahi_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("badami qorma")){
                 badami_qorma_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("green karahi")){
                 green_karahi_r = rs.getString("item_price");
                 }
                  else if(rs.getString("item").equals("kheer")){
                 kheer_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("rabri kheer")){
                 rabri_kheer_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("custurd")){
                 custurd_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("labi sheri")){
                 labi_sheri_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("dodh dulari")){
                 dodh_dulari_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("gajar halwa")){
                 gajar_halwa_r = rs.getString("item_price");
                 }  else if(rs.getString("item").equals("loki halwa")){
                 loki_halwa_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("gulab jaman")){
                 gulab_jaman_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("soji halwa")){
                 soji_halwa_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("szarda VIP")){
                 zarda_VIP_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("zarda zafrani")){
                 zarda_zafrani_r = rs.getString("item_price");
                 } 
                   else if(rs.getString("item").equals("zarda normal")){
                 zarda_normal_r = rs.getString("item_price");
                 } 
                   else if(rs.getString("item").equals("zarda full VIP")){
                 zarda_full_VIP_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("milk roti")){
                 milk_roti_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("naan roti")){
                 naan_roti_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("taftan")){
                 taftan_r = rs.getString("item_price");
                 }  
                   else if(rs.getString("item").equals("sheermal")){
                 sheermal_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("coldrink reg")){
                 cold_reg_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("coldrink jambo")){
                 cold_jambo_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("mineral water normal 500")){
                 normanl_mineral_500_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("mineral water aquafina 500")){
                 aqua_mineral_500_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("mineral water normal 1.5")){
                 normanl_mineral_15_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("mineral water aquafina 1.5")){
                 aqua_mineral_15_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("normal salid")){
                 normal_salid_r = rs.getString("item_price");
                 }
                   else if(rs.getString("item").equals("salid khchomar")){
                 salid_kachomar_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("russain salid")){
                 rusain_salid_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("raita")){
                 raita_r = rs.getString("item_price");
                 }
                 else if(rs.getString("item").equals("potato")){
                 potato_r = rs.getString("item_price");
                 }
                 
                 
                 
                 
                 
                 
                 
                 
                 
             }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        //price
       
    }
     
    
}















//            normal salid
//            salid khchomar
//            russain salid
//            raita
