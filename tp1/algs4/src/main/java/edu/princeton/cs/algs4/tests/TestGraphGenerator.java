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
		assertEquals("Simple vertex number is correct", V, testGraph.V());
		assertEquals("Simple edge number is correct", E, testGraph.E());
		assertEquals("Simple type is correct","simple", testGraph.getTypeName());
	}

	@Test
	public void testSimpleIntDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testComplete() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompleteBipartite() {
		fail("Not yet implemented");
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
