/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class PrincipalTest {
    
    private Persona persona;
    private static Persona personaNull;

    public PrincipalTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
        personaNull = new Persona();
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
        persona = new Persona("123452");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    /**
     * Test of main method, of class Principal.
     */
    @Test
    public void testLongitudNombre() {
        assertTrue(persona.getNombre().length() > 5);
   
    }
    
    @Test (expected = NullPointerException.class)
    public void testNombreNulo() {
        String r = personaNull.getNombre().toUpperCase();        
    }

}
