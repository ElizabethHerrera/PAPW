/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg9;

import java.util.Scanner;
/**
 *
 * @author liz60
 */
public class Tarea9 {
    
    static int o;
    static int tele = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Afuera();
    }
    
    public static void Afuera(){
        System.out.println("Estás afuera.");
        System.out.println("¿Quieres entrar?");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        if(o == 1){
            Adentro();
        }
    }
    public static void Adentro(){
        System.out.println("-------------");
        System.out.println("¿A dónde quieres ir?");
        System.out.println("1. La sala \n2. Mí cuarto \n3. La cocina \n4. Afuera" );
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        switch (o) {
            case 1:
                Sala();
                break;
            case 2:
                Cuarto();
                break;
            case 3:
                Cocina();
                break;
            case 4:
                Afuera();
                break;
        }
    }
    
    public static void Sala(){
        System.out.println("-------------");
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Ver la televisión \n2. Llamar a alguien \n3. Ir a otra habitación" );
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        switch (o) {
            case 1:
                if(tele != 0){
                    System.out.println("-------------");
                    System.out.println("Hay una pelicula en la televisión, pero no es tan entretenida.");
                    System.out.println("¿Deseas apagarla?");
                    System.out.println("1. Sí \n2. No" );
                    o = scanner.nextInt();
                    scanner.nextLine();
                    if(o == 1){
                        Sala();
                    }else{
                        System.out.println("-------------");
                        System.out.println("BZZZZZZZZZ.");
                        System.out.println("La televisión comenzó a tener estática.");
                        System.out.println("¿Quieres acercarte?.");
                        System.out.println("1. Sí \n2. No" );
                        o = scanner.nextInt();
                        scanner.nextLine();
                        if(o == 1){
                            System.out.println("-------------");
                            System.out.println("Unas manos sale de la pantalla y te estrangulan.");
                            System.out.println("BZZZZZZZZZ BZZZZZZ");
                            System.out.println("Haz muerto.");
                        }else{                            
                            System.out.println("La televisión se apaga por si sola, debio descomponerse.");      
                            tele = 0;
                            Sala();
                        }
                    }
                }else{
                    System.out.println("La televisión no funciona.");
                    Sala();
                }
                break;
            case 2:
                System.out.println("-------------");
                System.out.println("¿A quien llamas?.");               
                System.out.println("1. La pizzería \n2. Tu mamá \n3. Nadie" );
                o = scanner.nextInt();
                scanner.nextLine();
                switch(o){
                    case 1:
                        System.out.println("-------------");
                        System.out.println("Ordenas una pizza, llegará en unos 30 minutos aproximadamente.");                       
                        break;                   
                    case 2:
                        System.out.println("-------------");                    
                        for (int i = 0; i < 40; i++){
                            System.out.println("...");
                        }
                        System.out.println("Tu madre te regaña por no llamarla seguido.");
                        System.out.println("Decides ir a dormir al quedarte sin energía.");
                        break;    
                }
                break;
            case 3:
                System.out.println("Hay una pelicula en la televisión, pero no es tan entretenida.");
                System.out.println("¿Deseas apagarla?");
                System.out.println("1. Sí \n2. No" );
                o = scanner.nextInt();
                scanner.nextLine();
                break;
            case 4:
                Afuera();
                break;
        }
    }
    
    public static void Cuarto(){
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Dormir \n2. Escuchar música \n3. Usar computadora \n4. Regresar");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        switch (o) {
            case 1:            
                System.out.println("-------------");
                System.out.println("Te recuestas pero no logras dormir.");
                System.out.println("¿Levantarte?");
                System.out.println("1. Sí \n2. No" );
                o = scanner.nextInt();
                scanner.nextLine();
                if(o == 1){
                    System.out.println("-------------");
                    System.out.println("Escuchas un ruido abajo.");
                    System.out.println("¿Deseas ir a checar?");
                    System.out.println("1. Sí \n2. No" );
                    if(o == 1){
                        System.out.println("-------------");
                        System.out.println("Un ladrón a entrado a tu casa, parece tener un arma pero no te ha visto.");
                        System.out.println("¿Qué deseas hacer?");
                        System.out.println("1. Llamar a la polícia \n2. Enfrentarse con el ladrón \n3. Ignorarlo e ir a otra habitación" );
                        o = scanner.nextInt();
                        scanner.nextLine();
                        switch(o){
                            case 1:
                                System.out.println("-------------");
                                System.out.println("El ladrón te escucha y te amenaza con el arma.");
                                System.out.println("¿Qué harás?");
                                System.out.println("1. Bajar el teléfono \n2. Huir \n3. Arrojarle el teléfono");
                                o = scanner.nextInt();
                                scanner.nextLine();
                                switch(0){
                                    case 1:
                                        System.out.println("-------------");
                                        System.out.println("El ladrón te dice que te acerques.");
                                        System.out.println("Otro ladrón entra a tu casa.");
                                        System.out.println("¿Te acercas?.");
                                        System.out.println("1. Sí \n2. No");
                                        o = scanner.nextInt();
                                        scanner.nextLine();
                                        if(o == 1){
                                            System.out.println("-------------");
                                            System.out.println("Los ladrones te amordazan pero llega la polícia a ayudarte.");
                                            System.out.println("Estás a salvo.");
                                        }else{
                                            System.out.println("-------------");
                                            System.out.println("Los ladrones se molestan y te disparan.");
                                            System.out.println("Haz muerto.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("-------------");
                                        System.out.println("El ladrón te ve, pero no lográ dispararte.");
                                        System.out.println("Al salir, ves que el ladrón no esta solo y te capturan.");
                                        System.out.println("Haz muerto.");
                                        break;
                                    case 3:
                                        System.out.println("-------------");
                                        System.out.println("No logras lastimar al ladrón con tu mala puntería.");
                                        System.out.println("El ladrón te dispara.");
                                        System.out.println("Haz muerto.");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("-------------");
                                System.out.println("Peleas con el ladrón pero llega otro a ayudarle.");
                                System.out.println("Entre los dos te detienen y asesinan.");
                                System.out.println("Haz muerto.");                  
                                break;
                            case 3:
                                System.out.println("-------------");
                                System.out.println("El ladrón te ve y te persigue.");
                                System.out.println("Te atrapa y dispara.");
                                System.out.println("Haz muerto.");                  
                                break;
                        }
                    }else{
                        System.out.println("-------------");
                        System.out.println("Un ladrón con un arma entra a tu habitación.");
                        System.out.println("Haz muerto.");
                    }           
                }else{
                    System.out.println("-------------");
                    System.out.println("Lográs dormir pero eres asesinado por unos ladrones.");                   
                    System.out.println("Haz muerto.");
                }            
                break;
            case 2:
                System.out.println("-------------");
                System.out.println("Tienes los mejores gusto de música, no puedes evitar cantar.");               
                System.out.println("Alguien esta tocando a tu puerta.");
                System.out.println("¿Bajar a ver quién es?");
                System.out.println("1. Sí \n2. No");
                o = scanner.nextInt();
                scanner.nextLine();
                if(o == 1){
                    System.out.println("-------------");
                    System.out.println("Detienes la música y bajas a ver quién es.");
                    System.out.println("Caes por las escaleras y te rompes el cuello.");                
                    System.out.println("Haz muerto.");
                }else{
                    System.out.println("-------------");
                    System.out.println("Lo ignoras y sigues cantando, dejan de tocar.");
                    System.out.println("¿Seguir en tu habitación?");
                    System.out.println("1. Sí \n2. No");
                    if(o ==  1){
                        System.out.println("-------------");
                        System.out.println("Te diviertes mientras cantas.");                        
                        System.out.println("Estás feliz.");
                    }else{
                        System.out.println("-------------");
                        System.out.println("Apagas la música y sales de cuarto.");  
                        Adentro();
                    }
                }
                break;
            case 3:
                System.out.println("Enciendes tu computadora, te encuentras con varias notificaciones en tus redes sociales.");
                System.out.println("¿Revisarlas?");
                System.out.println("1. Sí \n2. No" );
                o = scanner.nextInt();
                scanner.nextLine();
                if(o == 1){
                    System.out.println("La persona que amas, subio fotográfias de su boda con alguien que no eres tú.");
                    System.out.println("¿Seguir revisando las notificaciones?.");
                    System.out.println("1. Sí \n2. No" );
                    o = scanner.nextInt();
                    scanner.nextLine();
                    if(o == 1){
                        System.out.println("Tus mejores amigos salieron de viaje sin invitarte.");
                    }
                }
                break;
            case 4:
                Adentro();
                break;
        }
       
    }
    public static void Cocina(){
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Ver la televisión \n2. Llamar a alguien \n3. Ir a otra habitación" );
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
       
    }
}
