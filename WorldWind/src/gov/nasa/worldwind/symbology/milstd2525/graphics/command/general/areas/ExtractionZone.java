/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.symbology.milstd2525.graphics.command.general.areas;

/**
 * Implementation of the Extraction Zone graphic (hierarchy 2.X.2.1.3.6, SIDC: G*GPGAX---****X).
 *
 * @author pabercrombie
 * @version $Id$
 */
public class ExtractionZone extends GeneralArea
{
    public final static String FUNCTION_ID = "GAX---";

    @Override
    protected String createLabelText()
    {
        return "EZ\n" + this.getText();
    }

    @Override
    public String getFunctionId()
    {
        return FUNCTION_ID;
    }
}