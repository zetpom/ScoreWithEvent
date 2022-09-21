/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scorewithevent;

import java.util.EventListener;
/**
 *
 * @author ZETPOM
 */
public class Subscriber implements ScoreListener{
    
    @Override
    public void scoreChange(ScoreEvent e){
        System.out.println("live result: Thai " + e.getSomeData());
    }
}
