/*
 * This file is part of lanterna (https://github.com/mabe02/lanterna).
 * 
 * lanterna is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright (C) 2010-2019 Martin Berglund
 */
package com.googlecode.lanterna.gui2;

/**
 * Enum for distinguishing between horizontal and vertical directions. Used in {@code LinearLayout} and
 * {@code Separator}.
 * @author Martin
*/
public enum Direction {
    /**
     * Horizontal direction, meaning something is moving along the x-axis (or column-axis)
     */
    HORIZONTAL, //See? I can spell it!
    /**
     * Vertical directory, meaning something is moving along the y-axis (or row-axis)
     */
    VERTICAL,
    ;
}
