/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.criptografia;

/**
 *
 * @author arthur
 */
public class Resolucao implements Runnable{
    private static int key = 2789;
    private static String message = "{55,65,21,80,21,0,67,92,25,19,17,84,3,65,7,84,86,5,12,67,86,5,6,17,20,0,17,67,31,6,2}";
    
    public static void main(String[] args){
        System.out.println("Mensagem criptografada: ");
        System.out.println("{" + Resolucao.message + "}");
        
        new Thread(new Resolucao()).start();
    }

    @Override
    public void run() {
        Descriptografa d = new Descriptografa(Resolucao.message, Resolucao.key + "");
        int mensD[] = d.descriptografa();
        System.out.println("Suposta mensagem descriptografada:");
        System.out.println("{" + d.getMensagemDescripto() + "}");
    }
}
