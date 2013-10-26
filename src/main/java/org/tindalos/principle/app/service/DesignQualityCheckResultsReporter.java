package org.tindalos.principle.app.service;

import java.util.Map;

import org.tindalos.principle.app.service.impl.Printer;
import org.tindalos.principle.domain.checker.DesignQualityCheckResults;
import org.tindalos.principle.domain.detector.core.CheckResult;
import org.tindalos.principle.domain.detector.core.ViolationsReporter;

import com.google.common.collect.Maps;

public class DesignQualityCheckResultsReporter {

	private Map<Class<? extends CheckResult>, ViolationsReporter<? extends CheckResult>> reporters;

	private final Printer printer;

	public DesignQualityCheckResultsReporter(Printer printer) {
		this.printer = printer;
	}
	public DesignQualityCheckResultsReporter(Printer printer, Map<Class<? extends CheckResult>, ViolationsReporter<? extends CheckResult>> reporters) {
		this(printer);
		this.reporters = Maps.newHashMap(reporters);
	}
	
	public void report(DesignQualityCheckResults results) {

		for (CheckResult checkResult : results.resultList()) {
			ViolationsReporter reporter = reporters.get(checkResult.getClass());
			String report = reporter.report(checkResult);

			if (checkResult.violationsDetected()) {
				printer.printWarning(report);
			} else {
				printer.printInfo(report);
			}
		}
	}
	
	public void setReporters(Map<Class<? extends CheckResult>, ViolationsReporter<? extends CheckResult>> reporters) {
		this.reporters = Maps.newHashMap(reporters);
	}

}