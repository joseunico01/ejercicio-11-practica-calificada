
package ejer11;

import javax.swing.JOptionPane;

public class Ejer11 {

    public static void main(String[] args) {
        
        int opcion, n_alumnos, opcion_modificar;
        int k=0;
        int m,nota;
        
        n_alumnos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número total de alumnos: "));
        
        String nombres[] = new String[n_alumnos];
        int codigo[] = new int[n_alumnos];
        float alt[] = new float[n_alumnos];
        String sexo[] = new String[n_alumnos];
        
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU"+
                    "\n"+
                    "\n1. Ingrese los datos de los alumnos."+
                    "\n2. Buscar datos por codigo."+
                    "\n3. Eliminar nombre."+
                    "\n4. Salir."));
            
            switch(opcion){
                
                case 1:
                    
                    for (int i=0 ; i<n_alumnos ; i++){
                        codigo[i]=Integer.parseInt(JOptionPane.showInputDialog( (i+1) + ". Digite el código del alumno: "));
                        
                        
                        for (int j=0 ; j<n_alumnos ; j++){
                            
                            if(j==k){
                                
                              nombres[j]=JOptionPane.showInputDialog( (j+1) + ". Digite el nombre del alumno: ");  
                              sexo[j]=JOptionPane.showInputDialog( (j+1) + ". Digite el sexo del alumno: "); 
                              alt[j]=Float.parseFloat(JOptionPane.showInputDialog( (j+1) + ". Digite la altura del alumno: "));
                              
                            }  
                        }
                        k++;
                    }
                     for (int i=0 ; i<n_alumnos ; i++){
                         System.out.print((i+1)+". Codigo: "+codigo[i]+"\n");
                         System.out.println("");
                         
                     }
                         for (int j=0 ; j<n_alumnos ; j++){
                             System.out.println("Datos x codigos: \n");
                             System.out.println((j+1)+". "+nombres[j]);
                             System.out.println((j+1)+". "+sexo[j]);
                             System.out.println((j+1)+". "+alt[j]);
                             System.out.println("");
                     }
                                   
                    break;
                    
                case 2:
                    
                    m = Integer.parseInt(JOptionPane.showInputDialog("Digite el código del alumno buscado: "));
                    
                    for (int i=0 ; i<codigo.length ; i++){
                        
                        if( m == codigo[i] ){
                            
                            JOptionPane.showMessageDialog(null,"\tEl nombre si está registrado\n"+
                                    "\nNombre --> "+ nombres[i]+
                                    "\nCódigo -->"+ codigo[i]+
                                    "\naltura -->"+alt[i]+
                                    "\nsexo-->"+sexo[i]);   
                        }  
                    }
                    
                    break;
                    
                case 3:
                    
                    opcion_modificar = Integer.parseInt(JOptionPane.showInputDialog("Digite la posición del nombre a modificar: " ));
                        
                        if (opcion_modificar >= n_alumnos){
                            
                            JOptionPane.showMessageDialog(null,"Esta posición no existe.");
                        }
                        
                        else {
                            
                            codigo[opcion_modificar] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo valor de este dato: "));
                            System.out.println("");
                            
                            for(int i = 0 ; i<codigo.length ; i++ ){
                                
                                System.out.println((i) +". "+ codigo[i]);
                               
                            }
                        }
                    break;
                
            }
              
        }while(opcion != 4);
        
        
    }
    
}
