package com.prode.torneoApuestas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class main {

	public static void main(String[] args) {

		//leer los archivos
	    String filePath1="C:\\Users\\Usuario\\eclipse-workspace\\torneoApuestas\\src\\main\\java\\archivos\\pronostico.csv";
		String filePath ="C:\\Users\\Usuario\\eclipse-workspace\\torneoApuestas\\src\\main\\java\\archivos\\resultados.csv";
		
		List<Participante> participantes= new ArrayList<>();
		List<Partido> partidos = new ArrayList<>(); 
		List<resultadoEnum> resul = new ArrayList<>();
		ArrayList<String> palabras = new ArrayList<>(); 
		
		try (Stream<String> streanfile = Files.lines(Paths.get(filePath))) {				
		
			   participantes = streanfile.map(linea -> linea.split(";")).map(arreglo-> {					
				Participante part=new Participante(arreglo[0], filePath);
			
				return part;
				
			   }).collect(Collectors.toList());	
				
			   } catch (IOException io) {
			System.err.println("error"+ io.getMessage());
		}	
		
		try (Stream<String> streanfile = Files.lines(Paths.get(filePath))) {	
			resul = streanfile.map(linea -> linea.split(";")).map(arre-> {
				resultadoEnum par =new resultadoEnum(arre[2],arre[3]);	
				// hacer numeros enteros los resultados
				  int[] arregloDeEnteros = new int[1];
				  int[] arregloDeEnteros2 = new int[1];
				  
				  //para cargar los resultados 
				  String[] arreglo1= new String[1];
				    
				  String equipo = new String(arre[1]);
				   System.out.println(arre[1]+" versus "+arre[4]);					   
				  
				  for (int i = 0; i < arregloDeEnteros.length; i++) {
					  arregloDeEnteros[i] =Integer.parseInt(arre[2]);						 
		            }
				  for (int j = 0; j < arregloDeEnteros.length; j++) {
					  arregloDeEnteros2[j] =Integer.parseInt(arre[3]);						 
		            }
				  
				  // saber los resultados
				  for (int i = 0; i < arregloDeEnteros.length; i++) {
					  
					if(arregloDeEnteros[i]==arregloDeEnteros2[i]) {
						 
						// cargo el resultado en un arreglo
					arreglo1[i] = ("empate");						
						   
					   } else if (arregloDeEnteros[i]>arregloDeEnteros2[i]){
						  
						   arreglo1[i] = ("local");
							 
						  
					   } else {
						 
						   arreglo1[i] = ("visitante");				   
						 
					   }
					
					// imprimo el arreglo
					  System.out.println("resultado:"+arreglo1[i]);
					 
					System.out.println("----------------------");
					}
				  				
				return par;		
				
				}).collect(Collectors.toList());
			
		 } catch (IOException io) {
				System.err.println("error"+ io.getMessage());
			}	
		
		
		try (Stream<String> streanfile = Files.lines(Paths.get(filePath1))) {				
			
			   participantes = streanfile.map(linea -> linea.split(";")).map(arreglo-> {					
				Participante part=new Participante(arreglo[0], filePath1);
				System.out.println("pronostico: " +arreglo[6]);
				
				
				
				return part;
				
			   }).collect(Collectors.toList());	
				
			   } catch (IOException io) {
			System.err.println("error"+ io.getMessage());
		}		
		
		

	}

}
