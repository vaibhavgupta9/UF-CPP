import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 6/15/17.
 */
public class ChrisSolutionTest {
    Solution sol = new ChrisTwoPointerSolution();

    @Test
    public void whenTemplateNotCoveredThenReturnEmptyStr() throws Exception {
        String s = "ABCDEAACGDEGDA";
        String t = "ABCDAH";

        assertEquals("", sol.minWindow(s, t));
    }

    @Test
    public void whenTemplateCoveredThenReturnWindow() throws Exception {
        String s = "ACDEF";
        String t = "ADE";

        assertEquals("ACDE", sol.minWindow(s, t));
    }

    @Test
    public void givenEmptyTemplateWhenNonEmptyStrThenReturnEmpty() throws Exception {
        String s = "ACDEF";
        String t = "";

        assertEquals("", sol.minWindow(s, t));
    }

    @Test
    public void whenTemplateAppearOnePlusInStringThenReturnMinWindow() throws Exception {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        assertEquals("BANC", sol.minWindow(s, t));
    }

    @Test
    public void whenTemplateAppearOnePlusInStringThenReturnMinWindow2() throws Exception {
        String s = "ADOBECODEBAAC";
        String t = "ABC";

        assertEquals("BAAC", sol.minWindow(s, t));
    }
}