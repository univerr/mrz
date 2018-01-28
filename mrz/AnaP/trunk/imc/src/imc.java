//alx
//simple project created by alexsyfk,docent Ana patricia M. fontes
//created on 04/04/17 01:00pm,finished at 7:55pm on 04/05/17
import java.util.Scanner;
class imc{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
pessoa p1 = new pessoa();
System.out.println("informe quantas pessoas na residencia");
p1.setQuant_pessoa(sc.nextInt());
pessoa px[] = new pessoa[p1.getQuant_pessoa()];


//  char esc = 27;   
  String clear = (char)27 + "[2J"; //codigo ansi para limpar a tela 
System.out.print(clear); 
  //pegando dados

int i=0;
  while(i<px.length){
System.out.println("peso da  pessoa "+(i+1));
p1.setPeso(sc.nextFloat());

System.out.println("altura?");
p1.setAltura(sc.nextFloat());

p1.Icm(p1.getPeso(),p1.getAltura());

if(p1.getImc()<18.5){
System.out.println("seu icm eh "+p1.getImc()+" vc estah muito magro!\n");
    
}
else if(p1.getImc()>25){
    System.out.println("seu icm eh "+p1.getImc()+" vc estah muito pesado!\n");
    
}
else{
    System.out.println("seu icm eh "+p1.getImc()+" vc estah ideal!\n");
}
px[i]=new pessoa(p1.getPeso(),p1.getAltura(),p1.getImc()); 
++i;
}
  i=0;
  for(;i<px.length;i++){ 
      System.out.println((i+1)+"a Pessoa");
    System.out.println("altura: "+px[i].getAltura());
    System.out.println("peso: "+px[i].getPeso());
    System.out.println("imc: "+px[i].getImc()+"\n\n");
  }
    /*
for(int o=0;i<px.length;o++){  
    System.out.println("\n\n\nPessoa "+i+1);
    System.out.println(px[o].getAltura());
    System.out.println(px[o].getPeso());
    System.out.println(px[o].getImc());
}
*/

}
}//finished 04/05/17,everything be ok
