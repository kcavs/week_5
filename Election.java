import java.util.*;
import java.text.NumberFormat;
public class Election{
    public static void main(String[] args) {
        int nyA_votes;
        int njA_votes;
        int cA_votes;
        int nyM_votes;
        int njM_votes;
        int cM_votes;
        NumberFormat percent= NumberFormat.getPercentInstance();
        Scanner input = new Scanner(System.in);
        System.out.println("how many votes did awbrey get in new york: ");
        nyA_votes = input.nextInt();
        System.out.println("how many votes did awbrey get in new jersey: ");
        njA_votes = input.nextInt();
        System.out.println("how many votes did awbrey get in connecticut: ");
        cA_votes = input.nextInt();
        System.out.println("how many votes did martinez get in new york: ");
        nyM_votes = input.nextInt();
        System.out.println("how many votes did martinez get in new jersey: ");
        njM_votes = input.nextInt();
        System.out.println("how many votes did martinez get in connecticut: ");
        cM_votes = input.nextInt();
        int a_votes= (nyA_votes+njA_votes+cA_votes);
        int m_votes= (nyM_votes+njM_votes+cM_votes);
        int total_votes= (a_votes+m_votes);
        double a_per;
        double m_per;
        a_per= ((double)a_votes/(double)total_votes);
        m_per= ((double)m_votes/(double)total_votes);
        input.close();
        System.out.println("candidate\t\tvotes\tpercentage");
        System.out.println("awbrey\t\t\t"+a_votes+"\t"+(percent.format(a_per)));
        System.out.println("martinez\t\t"+m_votes+"\t"+(percent.format(m_per)));
    }
}