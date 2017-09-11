package edu.princeton.cs.algs4.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class TestGraphGenerator {

	@Test
	public void testSimpleIntInt() {
		int V = 2;
		int E = 1;
		Graph testGraph = GraphGenerator.simple(V, E);
		//Testing Type
		assertEquals("Simple type is correct","simple", testGraph.getTypeName());
		// Testing V/E count
		assertEquals("Simple vertex number is correct", V, testGraph.V());
		assertEquals("Simple edge number is correct", E, testGraph.E());	
	}

	@Test
	public void testSimpleIntDouble() {
		int V = 5;
		double P = 0.66;
		Graph testGraph = GraphGenerator.simple(V, P);
		//Testing Type
		assertEquals("Simple Erdos-Renyi type is correct","simple", testGraph.getTypeName());
		// Testing V/E count
		assertEquals("Simple Erdos-Renyi vertex number is correct", V, testGraph.V());
	}

	@Test
	public void testComplete() {
		int V = 11;
		Graph testGraph = GraphGenerator.complete(V);
		//Testing Type
		assertEquals("Complete type is correct","complete", testGraph.getTypeName());
		// Testing V/E count
		assertEquals("Complete vertex number is correct", V, testGraph.V());
	}

	@Test
	public void testCompleteBipartite() {
		int V1 = 11;
		int V2 = 2;
		Graph testGraph = GraphGenerator.completeBipartite(V1,V2);
		//Testing Type
		assertEquals("Complete Bipartite type is correct","completeBipartite", testGraph.getTypeName());
		// Testing V/E count
		assertEquals("Complete Bipartite vertex number is correct", V1 + V2, testGraph.V());
	}

	@Test
	public void testBipartiteIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testBipartiteIntIntDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testPath() {
		fail("Not yet implemented");
	}

	@Test
	public void testBinaryTree() {
		fail("Not yet implemented");
	}

	@Test
	public void testCycle() {
		fail("Not yet implemented");
	}

	@Test
	public void testEulerianCycle() {
		fail("Not yet implemented");
	}

	@Test
	public void testEulerianPath() {
		fail("Not yet implemented");
	}

	@Test
	public void testWheel() {
		fail("Not yet implemented");
	}

	@Test
	public void testStar() {
		fail("Not yet implemented");
	}

	@Test
	public void testRegular() {
		fail("Not yet implemented");
	}

	@Test
	public void testTree() {
		fail("Not yet implemented");
	}

}
