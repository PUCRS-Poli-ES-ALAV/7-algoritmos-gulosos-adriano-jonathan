public class Exer2 {
    
    public static void main (String[] args){

        int i, j=0, capacidade;
        int m,n=4;
        float soma = 0, razao;
        int[][] a1 = new int [2][4];
        a1[0] = new int[]{2,4,6,8};
        a1[1] = new int[]{20,50,60,80};
        capacidade = 6;
        m = capacidade;
        while(m>=0){
            razao=0;
            for(i=0;i<n;i++){
                if(((float)a1[1][i]/(float)a1[0][i]) > razao){
                    razao =  (float)a1[1][i]/(float)a1[0][1];
                    j=i;
                }
            }
            if(a1[0][j] > m){
                soma+=m*razao;
                m=-1;
            }else{
                m-=a1[0][j];
                soma+=(float) a1[1][j];
                a1[1][j]=0;
            }
        }
        System.out.println(" o Final do programa e " + soma);


    }
}
