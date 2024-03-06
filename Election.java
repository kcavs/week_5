public class Election{
    public static void main(String[]args){
        int nyA_votes = 314159;
        int njA_votes = 89008;
        int cA_votes = 213451;
        int nyM_votes = 271860;
        int njM_votes = 121032;
        int cM_votes= 231034;
        int a_votes= (nyA_votes+njA_votes+cA_votes);
        int m_votes= (nyM_votes+njM_votes+cM_votes);
        int total_votes= (a_votes+m_votes);
        double a_per= ((a_votes/total_votes)*100);
        double m_per= ((m_votes/total_votes)*100);
        System.out.println(a_per+"and"+a_votes);
        System.out.println(m_per+"and"+m_votes);
    }
}