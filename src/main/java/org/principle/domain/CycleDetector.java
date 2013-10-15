package org.principle.domain;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import jdepend.framework.JavaPackage;

import org.principle.domain.core.Cycle;
import org.principle.domain.core.Package;
import org.principle.domain.core.PackageReference;

public class CycleDetector {
    
    private final PackageStructureBuilder packageStructureBuilder;
    
    public CycleDetector(String basePackageName) {
        this.packageStructureBuilder = new PackageStructureBuilder(basePackageName);
    }

    public List<Cycle> analyze(Collection<JavaPackage> packages) {
        
        Package basePackage = packageStructureBuilder.build(packages);
        Map<PackageReference, Package> references = basePackage.toMap();
        return basePackage.detectCycles(references);
    }
}
