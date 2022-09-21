/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scorewithevent;

import java.util.Scanner;
/**
 *
 * @author ZETPOM
 */
public class ScoreWithEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ScoreSource ss = new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();

        ss.addScoreListener(sub1);
        ss.addScoreListener(sub2);

        String inp;
        System.out.println("(EXAMPLE) Enter Score Thai 1-0 UAE ");
        while(true){
            System.out.print("Enter Score ");
            inp = sc.nextLine();
            if(!inp.equals("")) ss.setScoreLine(inp);
            else break;
        }
    }

}
