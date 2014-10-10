/**
 * 
 */
package org.titom.investigator.aspect;

import java.util.Locale;

/**
 * @author Utilisateur
 *
 */
public aspect MyAspect {

    pointcut captain(Locale loc) : 
        execution(* *.captain(Locale, ..)) && args(loc, *);

    before(Locale loc): captain(loc) {
        System.out.println("About to think about the aspects in locale '" + loc
                + "', Captain!");
    }
}
