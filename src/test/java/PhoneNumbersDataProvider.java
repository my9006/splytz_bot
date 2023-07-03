import org.testng.annotations.DataProvider;

public class PhoneNumbersDataProvider {

    @DataProvider(name = "phoneNumbers", parallel = true)
    public static Object[][] phoneNumbers() {
        return new Object[][]{
                new String[]{"44220020"},
                new String[]{"94800800"},
                new String[]{"77771520"},
                new String[]{"99495330"},
                new String[]{"77458102"},
                new String[]{"77001110"},
                new String[]{"99249993"},
                new String[]{"99447795"},
                new String[]{"55603030"},
                new String[]{"91394675"},
                new String[]{"77460604"},
                new String[]{"77103203"},
                new String[]{"77808990"},
                new String[]{"44788303"},
                new String[]{"94800801"},
                new String[]{"77010203"},
                new String[]{"77120333"},
                new String[]{"77103102"},
                new String[]{"77586652"},
                new String[]{"94782333"},
                new String[]{"77500303"},
                new String[]{"77023366"},
                new String[]{"77441010"},
                new String[]{"77100258"},
                new String[]{"77413002"},
                new String[]{"55161788"},
                new String[]{"94545454"}
        };
    }

}
