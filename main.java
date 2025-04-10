public class zZZbadClassnamezzZ {
public static void main(String[] argz) {
int[] daNums = {5,2,9,1,5,6};
SortzDem(daNums);
for(int q=0;q<daNums.length;q++)System.out.print(daNums[q]+" ");
}

public static void SortzDem(int[] aRRr){
for(int i=0;i<=aRRr.length;i++){
for(int j=0;j<aRRr.length-1;j++)
{if(aRRr[j]>aRRr[j+1]){
int Tmp=aRRr[j+1];
aRRr[j+1]=aRRr[j];
aRRr[j]=Tmp;}}}
}
