package FactoryMethod;

import java.util.Scanner;
import FactoryMethod.fabricas.FabricaPDF;
import FactoryMethod.fabricas.FabricaPlanilha;
import FactoryMethod.fabricas.FabricaWord;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja gerar [1]PDF [2]Word [3]Planilha: ");
        int op = input.nextInt();
        if (op == 1){
            FabricaPDF pdf = new FabricaPDF();
            pdf.criarDocumentos().gerar();
            System.out.println();
        }
        else if (op == 2){
            FabricaWord word = new FabricaWord();
            word.criarDocumentos().gerar();
            System.out.println();
        }
        else if (op == 3){
            FabricaPlanilha planilha = new FabricaPlanilha();
            planilha.criarDocumentos().gerar();
            System.out.println();
        }
        else{
            System.out.println("Opção inválida");
        }
    }}


