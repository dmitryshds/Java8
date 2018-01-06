package biz.bagira.shds.optional;

import java.util.Optional;

public class App19 {

    private static String proceedArgs(String[] args)
    	{
    		if (args.length <= 0)
    			return null;

    		return args[0];
    	}

    	private static Optional<String> proceedArgsSafe(String[] args)
    	{
    		if (args.length <= 0)
    			return Optional.empty();

    		return Optional.of(args[0]);
    	}

    	public static void main(String[] args)
    	{
    		// Не знаем, какое именно значение будет возвращено
    		Optional<String> opt = Optional.ofNullable(proceedArgs(args));
    		// Здесь все спокойно - возвращается безопасный Optional-объект
    		opt = proceedArgsSafe(args);

    		String result = opt.orElse("defaultValue");
            System.out.println(result);
        }
}
