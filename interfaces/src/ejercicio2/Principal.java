package ejercicio2;

import java.util.Arrays;

public class Principal {
	  static Futbolista[] futbolistas = new Futbolista[5];
	    public static void main(String[] args) {
	        for (int i = 0; i < futbolistas.length; i++) {
	            futbolistas[i] = new Futbolista(3, 15, 10, "marta");
	        }
	        Arrays.sort(futbolistas);
	        for (int i = 0; i < futbolistas.length; i++) {
	            System.out.println(futbolistas[i].toString());
	        }
	    }
	}
