public class xiangqi {
    public static void main(String[] args) {
//        for(byte i=81;i>=0;i--){
//            if(i/9%3==i%9%3) continue;
//            System.out.println("A="+(i/9+1)+"B="+(i%9+1));
//        }
        for(int i=1;i<=9;i++){
            for (int j=1;j<=9;j++){
                if(i%3!=j%3){
                    System.out.println("A="+i+"B="+j);
                }
            }
        }
    }
}


