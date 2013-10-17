package org.tindalos.principle.domain.checker;

import java.util.List;

import org.tindalos.principle.domain.core.DesingCheckerParameters;
import org.tindalos.principle.domain.core.Package;

public interface PackageAnalyzer {
    
    List<Package> analyze(DesingCheckerParameters parameters);

}