import java.util.*;

public class Poker_Game {
    public static void main(String[] args) {
        Card c = new Card();
        CardDeck x= new CardDeck();

        c.card_info();
        x.cardDeck_info();
        x.shuffle_card();
        x.cardDeck_info();
        for(int i=1 ; i <= 56 ; i++){
            x.pick_card();
        }
        System.out.println();
        x.cardDeck_info();
        x.shuffle_card();
        x.cardDeck_info();
        x.pick_card();
        x.pick_card();
        x.card_info();
        System.out.println(x.shape+x.number);
    }
}

class Card{
    String shape;
    String number;

    Card(){
        this("Spade","A" );

    }
    Card(String shape, String number){
        this.shape = shape;
        this.number = number;
    }

    void card_info (){
        System.out.println(this.shape+" "+this.number);
    }

    public String toString(){
        return shape+" "+number;
    }


}

class CardDeck extends Card {
    String[] shapes = {"Spade", "Clover", "Heart", "Diamond"};
    String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    Card[][] cards= new Card[shapes.length][numbers.length];

    int remain_cards;
    int h=0;
    int l=0;
    int temph=h;
    int templ=l;

    CardDeck() {
        for (int i = 0; i < shapes.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                super.shape = shapes[i];
                super.number = numbers[j];

                cards[i][j] = new Card(super.shape, super.number);
            }
        }
        remain_cards=(shapes.length)*(numbers.length);
    }


    void cardDeck_info () {
        for(int i=0 ; i< shapes.length ; i++){
            System.out.print(Arrays.toString(cards[i]));
            System.out.println();
        }
        System.out.println(remain_cards);
        System.out.println();
    }

    void card_info () {
        if(cards[3][12]==null){
            System.out.println("카드가 없습니다.");
        }
        else {
            System.out.println("pick card:"+this.cards[h][l]);
        }

    }


    void shuffle_card(){
        if(cards[0][0]==null){

            for (int i = 0; i < shapes.length; i++) {
                for (int j = 0; j < numbers.length; j++) {

                    super.shape = shapes[i];
                    super.number = numbers[j];

                    cards[i][j] = new Card(super.shape, super.number);

                }
            }
            h=0;
            l=0;
            remain_cards=(shapes.length)*(numbers.length);
        }

        for (int i = 0; i < shapes.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                Card temp;
                int random1=(int)(Math.random()*4);
                int random2=(int)(Math.random()*13);
                temp=cards[i][j];
                cards[i][j]=cards[random1][random2];
                cards[random1][random2]=temp;
            }
        }



    }


    Card pick_card(){
        Card pick = new Card();
        pick=cards[h][l];
        pick.card_info();
      //  card_info();

        if(pick!=cards[3][12]) {

            //System.out.println(+cards[h][l]);
            cards[h][l] = null;
            remain_cards--;

            if (h < shapes.length && l < numbers.length-1) {
                pick = cards[h][l];
                l++;
            }
            else if (h < shapes.length && l == numbers.length-1) {
                pick = cards[h][l];
                h++;
                l -= 12;
            }
        }
        else if(pick==cards[3][12]){
            if(cards[3][12] == null){
                System.out.println("덱에 카드가 없습니다.");
            }
            else{
                pick = cards[3][12];
                //System.out.println(this.cards[h][l]);
                cards[3][12] = null;
                remain_cards--;
            }
        }
        return pick;
    }
}



//{"Spade", "Clover", "Heart", "Diamond"};
//= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//플레이어 1, 2
//게임 룰(p1 > p2 > p1 > p2)
//포커 규칙 (깡통 / (숫자) 원페어, 투페어, 트리플, 풀하우스, 포카드, 스트레이트 / (모양) 플러쉬 / (숫자,모양) 스트레이트 플러쉬)
//비교...까지....