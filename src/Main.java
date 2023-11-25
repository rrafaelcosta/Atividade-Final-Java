import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Carro> listaDeCarrosArrayList = new ArrayList<>();
    public static List<Carro> listaDeCarrosLinked = new LinkedList<>();

    public static void main(String[] args) {

        Carro carro = new Carro(1,"Fusca", 1980, "azul");
        listaDeCarrosArrayList.add(carro);

        CarroEletrico carroEletrico = new CarroEletrico(1,"Tesla", 2020, "preto", 50);
        listaDeCarrosLinked.add(carroEletrico);

        for(Carro obj : listaDeCarrosArrayList){
            System.out.println(obj);
        }

        for(Carro obj : listaDeCarrosLinked){
            System.out.println(obj);
        }

        Scanner sc = new Scanner(System.in);

        int codigo;

        System.out.println("Digite o codigo do carro procurado: ");
        codigo = Integer.parseInt(sc.nextLine());
        Carro carroProcurado = new Carro();
        carroProcurado.setIdCarro(codigo);

        if(listaDeCarrosArrayList.contains(carroProcurado)){
            System.out.println("Encontrei o carro na lista");
            int indice = listaDeCarrosArrayList.indexOf(carroProcurado);
            carroProcurado = listaDeCarrosArrayList.get(indice);
            System.out.println("Nome: " + carroProcurado.getModelo());
        }else{
            System.out.println("Nao esta na lista");
        }





    }
}