package org.example;
import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class VersionManagerTest {
    @CsvSource(textBlock = """
      0.0.1,   ''
      1.2.3,   1.2.3
      1.2.3,   1.2.3.4
      1.2.3,   1.2.3.d
      1.0.0,   1
      1.1.0,   1.1
  """)
    @ParameterizedTest(name = "initial version: \"{1}\"")
    @Order(2) @DisplayName("VersionManager initialization with initial version")
    void initializationTests(String expected, String version) {
        try {
            assertEquals(expected, new VersionManager(version).release());
        } catch(Exception e) {
            fail("Your code threw an Exception: " + e);
        }
    }
    @Test @Order(1) @DisplayName("VersionManager initialization without initial version")
    void initializationTests_defaultConstructor() {
        try {
            assertEquals("0.0.1", new VersionManager().release());
        } catch(Exception e) {
            fail("Your code threw an Exception: " + e);
        }
    }

    @Test @Order(3) @DisplayName("Major releases")
    void majorReleasesTests() {
        try {
            assertEquals("1.0.0", new VersionManager().major().release(), "First major release");
            assertEquals("2.0.0", new VersionManager("1.2.3").major().release(), "Major release after 1.2.3");
            assertEquals("3.0.0", new VersionManager("1.2.3").major().major().release(), "Second major release after 1.2.3");
        } catch(Exception e) {
            fail("Your code threw an Exception: " + e);
        }
    }

    @Test @Order(4) @DisplayName("Minor releases")
    void minorReleasesTests() {
        try {
            assertEquals("0.1.0", new VersionManager().minor().release(), "First minor relase");
            assertEquals("1.3.0", new VersionManager("1.2.3").minor().release(), "Minor release after 1.2.3");
            assertEquals("1.1.0", new VersionManager("1").minor().release(), "Minor relase after 1");
            assertEquals("4.2.0", new VersionManager("4").minor().minor().release(), "Second minor release after 4");
        } catch(Exception e) {
            fail("Your code threw an Exception: " + e);
        }
    }

    @Test @Order(5) @DisplayName("Patch releases")
    void patchReleasesTests() {
        try {
            assertEquals("0.0.2", new VersionManager().patch().release(), "First patch release");
            assertEquals("1.2.4", new VersionManager("1.2.3").patch().release(), "Patch release after 1.2.3");
            assertEquals("4.0.2", new VersionManager("4").patch().patch().release(), "Second patch release after 4");
        } catch(Exception e) {
            fail("Your code threw an Exception: " + e);
        }
    }

    @Test @Order(6) @DisplayName("Rollback tests")
    void rollbacksTests() {
        try {
            assertEquals("0.0.1", new VersionManager().major().rollback().release(), "Rollback of major release");
            assertEquals("0.0.1", new VersionManager().minor().rollback().release(), "Rollback of minor release");
            assertEquals("0.0.1", new VersionManager().patch().rollback().release(), "Rollback of patch release");
            assertEquals("1.0.0", new VersionManager().major().patch().rollback().release(), "Rollback of patch after major release");
            assertEquals("1.0.0", new VersionManager().major().patch().rollback().major().rollback().release(), "major -> patch -> rollback -> major -> rollback");
            assertEquals("0.0.1", new VersionManager().major().patch().rollback().rollback().release(), "Multiple rollbacks right after another: major -> patch -> rollback -> rollback");
        } catch(Exception e) {
            fail("Your code threw an Exception: " + e);
        }
    }

    @Test @Order(7) @DisplayName("Separated calls")
    void seperatedCallsTests() {
        try {
            VersionManager m = new VersionManager("1.2.3");
            m.major();
            m.minor();
            assertEquals("2.1.0", m.release());
            m.rollback();
            assertEquals("2.0.0", m.release());
        } catch (Exception e) {
            fail("Your code threw an Exception: " + e);
        }
    }

    @ValueSource(strings = {"a", "a.b.c", "1.a", "0.1.a.5"} )
    @ParameterizedTest(name = "initial version: \"{0}\"")
    @Order(8) @DisplayName("Invalid initial version")
    void invalidInitialVersion(String version) {
        assertEquals("Error occured while parsing version!",
                assertThrows(Exception.class, () -> new VersionManager(version)).getMessage(),
                "Wrong error message");
    }

    @Test @Order(9) @DisplayName("Invalid rollbacks")
    void invalidRollbacks() {
        VersionManager m = new VersionManager();
        assertEquals("Cannot rollback!",
                assertThrows(Exception.class, m::rollback).getMessage(),
                "Wrong error message");
        assertDoesNotThrow(m::major, "VersionManager should still be useable after failed rollback");
        assertEquals("1.0.0", m.release());
        assertDoesNotThrow(m::rollback, "VersionManager can rollback once");
        assertThrows(Exception.class, m::rollback, "Cannot rollback twice after one release");
        assertEquals("0.0.1", m.release());
    }
}