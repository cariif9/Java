package semesester5;

public class GamePlayer {

        String PlayerName ="Mohamed";
        String PlayaerId = "M120";
        int coins = 80;

        GamePlayer(){

        }
       public void  EarnCoins( int amount){
            if (amount <0) {
                System.out.println("Pls Enter Valid amount");
            }
            else
                coins += amount;
}
        public  void  SpenddCoins(int Amount){
            if (Amount > coins ){
                System.out.println("The coin is Not Enough");
            }
            else
                coins -=Amount;
        }
         public void giftCoins(String PlayerName, int Amount){

            if (Amount > coins){
                System.out.println("The Coins Is not Enough");
            }
            else
                coins -= Amount;
         }
}
