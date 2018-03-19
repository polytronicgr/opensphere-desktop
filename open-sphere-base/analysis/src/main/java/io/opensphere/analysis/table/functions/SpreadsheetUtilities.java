package io.opensphere.analysis.table.functions;

/**
 * Spreadsheet-related utilities for table models.
 */
public final class SpreadsheetUtilities
{
    /** Function values. */
    private static final SpreadsheetFunction[] FUNCTION_VALUES = new SpreadsheetFunction[] { new Sum(), new Min(), new Max(),
        new Median(), new Mean() };

    /**
     * Constructor.
     */
    private SpreadsheetUtilities()
    {
    }

    /**
     * Retrieves all standard Function values.
     *
     * @return array of defined values
     */
    public static SpreadsheetFunction[] getFunctions()
    {
        return FUNCTION_VALUES;
    }
}