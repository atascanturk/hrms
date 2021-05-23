package kodlamaio.hrms.core.utilities.tools;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.hrms.core.utilities.results.Result;

public class RunTools {
	public static Result[] runValidationRules(Result... results) {
		List<Result> resultList = new ArrayList<Result>();
		for (Result result : results) {
			if (!result.isSuccess()) {
				resultList.add(result);
			}
		}
		return resultList.toArray(new Result[resultList.size()]);
	}

	public static Result[] runChecks(Result... results) {
		return runValidationRules(results);
	}

}
