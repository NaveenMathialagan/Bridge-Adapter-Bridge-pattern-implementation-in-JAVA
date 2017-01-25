/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen kumar
 */
public abstract class absclass {
   protected DataBase db;
   protected absclass(DataBase db)
   {
      this.db=db;
   }
   public abstract void absfunc(String func,String[] param); 
}
