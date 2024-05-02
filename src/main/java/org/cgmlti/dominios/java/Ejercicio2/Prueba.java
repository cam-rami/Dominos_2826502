package org.cgmlti.dominios.java.Ejercicio2;

public class Prueba {
    public static void main(String[] args){
        // Crear 2 instalacias de cad entidad
        // Instaciar 2 veces cada entidad 
        // Crear dos objetivos de cada entidad 
        // 1. Nombre de la clase a instanciar
        // 2. Nombre del objeto identificador 
        // 3. Operador de asignacion 
        // 4. Palabra (referencia) new
        // 5. Otra vez en nombre de la clase 
        // 6. Parentesis (Contructor) 

        Hospital hospitalEngativa = new Hospital();
        Hospital hospitalSanJose = new Hospital();

        // Acceder a los atributos del objeto 
        // Operador
        // 1. identificador del objeto
        // 2. El punto 
        // 3. El atributo a trabajr 
        // 4. El operador de asignacion 
        // 5. El valor a signado al atributo

        hospitalEngativa.nombre = "Hospital de Engativa";
        hospitalEngativa.direccion = "Tranversal 100a #80a-50";
        hospitalEngativa.telefono = 155595689L;

        hospitalSanJose.nombre = "Hospital Infantil Universitario de San Jose ";
        hospitalSanJose.direccion = "Car. 52 #67a-71";
        hospitalSanJose.telefono = 371458798989L;

        //Crear Medico

        Medico medico1 = new Medico();
        medico1.nombre = "Dante Bebe";
        medico1.cedula = 123456789L;
        medico1.especialidad = "Oncologia";
        
        Medico medico2 = new Medico();
        medico2.nombre = "Negrita";
        medico2.cedula = 321987654L;
        medico2.especialidad = "Cardiologia";
        
        Medico medico3 = new Medico();
        medico3.nombre = "Niebla pepis";
        medico3.cedula = 963852741L;
        medico3.especialidad = "Neurologia";

        //Añadir medicos al hospital
        hospitalEngativa.listaMedicos.add(medico1);
        hospitalEngativa.listaMedicos.add(medico2);
        hospitalEngativa.listaMedicos.add(medico3);

        for(Medico medicoRecorrer : hospitalEngativa.listaMedicos){
            System.out.println("Medico: " + medicoRecorrer.nombre);
            System.out.println("Cedula: " + medicoRecorrer.cedula);
            System.out.println("Especialidad: " + medicoRecorrer.especialidad);
        }

        //Crear salas
        SalaHospital sala1 = new SalaHospital();
        sala1.numero = 101;
        sala1.cantidadCamas = 5;
        
        SalaHospital sala2 = new SalaHospital();
        sala2.numero = 102;
        sala2.cantidadCamas = 3;

        hospitalEngativa.ListaSala.add(sala1);
        hospitalEngativa.ListaSala.add(sala2);

        for(SalaHospital salaRecorrer : hospitalEngativa.ListaSala){
            System.out.println("Sala :" + salaRecorrer.numero);
            System.out.println("Cantidad de camas: " + salaRecorrer.cantidadCamas);
        }

    }

}
