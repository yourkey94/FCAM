class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i=0 ;i<CARD_NUM ; i++){
            if(i==0 || i==2 || i==7){
                cards [i]= new SutdaCard(i+1, true);
            }
            else if(10<=i){
                cards [i]= new SutdaCard(i-9, false);
            }
            else cards[i] = new SutdaCard(i + 1, false);
        }
    }

    void shuffle(){
        SutdaCard temp = new SutdaCard();
        for(int i=0 ; i<CARD_NUM ; i++ ){
            int a= (int)(Math.random()*20);
            temp = cards[i];
            cards[i] = cards[a];
            cards[a]=temp;
        }
    }

    SutdaCard pick(int index){
        return cards[index];
    }
    SutdaCard pick(){
        return cards[(int)(Math.random()*20)];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang = isKwang;
    }
    public String toString(){
        return num +(isKwang ? "K" : "");
    }
}
class Exam7_1{
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();


        for(int i=0; i<deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();
        System.out.println(deck.pick(0));

    }

}