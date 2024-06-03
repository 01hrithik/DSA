public class HCF {
    public static void main(String[] args) {
        int a=6;
        int b=3;
        int smaller_num;
        int hcf=1;
        if(a<b){
            smaller_num=a;
        }else{
            smaller_num=b;
        }
        for(int i=1; i<=smaller_num; i++){
            if((a%i==0)&&(b%i==0)){
                hcf=i;
                System.out.println(i+" = "+hcf);
            }
        }
        System.out.println(hcf);
    }
}
