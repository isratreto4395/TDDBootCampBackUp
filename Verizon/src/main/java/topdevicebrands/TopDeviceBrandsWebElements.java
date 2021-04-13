package topdevicebrands;

public class TopDeviceBrandsWebElements {

    //public static final String topAccessoryBrandsList = "div[class='gnav20-footer-level-one'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) ul:nth-child(1)";
    //public static final String topAccessoryBrandsList = "div[class='gnav20-footer-level-one'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2)";
    //public static final String topAccessoryBrandsList = "div[class='gnav20-footer-level-one'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) ul:nth-child(1) li:nth-child(1)";
    public static final String topAccessoryBrandsList = "//*[@class='gnav20-footer-list']";
    public static final String samsungLocator = "Samsung";
    //public static final String saveOnTheLatestButton ="//body/div/div/main[contains(@role,'main')]/div/div/section/div/div/div[contains(@aria-label,'carousel with 4 slides')]/div/div/div[contains(@aria-label,'Slide 1 of 4')]/div/div/div/div/a[1]";
    public static final String saveOnTheLatestButton ="//div[@aria-label='Slide 1 of 4']//div[2]";
    public static final String addFilterButton = "//button[normalize-space()='Add filters']";
    public static final String brandButton = "//button[normalize-space()='Brand']"; //xpath
    public static final String brandOption = "label[for='Brand0']"; //css
    public static final String colorButton = "//button[normalize-space()='Color']"; //xpath
    public static final String colorOption = "label[for='d_Color3']"; //css
    public static final String closeFilterButton = "//button[normalize-space()='Close filter']";
    public static final String pricingDropdown = "paymentOptions"; //id
    public static final String paymentOption = "//option[@value='.two-year-price']"; //xpath
    public static final String sortByDropdown = "sortOptions"; //id
    public static final String sortByOptions = "//option[@value='Featured']"; //css
    public static final String hoverFirstItemImage = "//body/div[@role='main']/div/div[@aria-labelledby='devices-content']/div[@class='devices-container positionRelative border_topGray']/div[@class='infinite-scroll-component__outerdiv']/div[@class='infinite-scroll-component gw-products-list']/div[1]/div[1]";
    public static final String firstItemAddToCompareButton = "//button[@title='Samsung Galaxy S21 5G']";
    public static final String hoverSecondItemImage = "//*[@data-track='{\"type\":\"panel\",\"name\":\"panel click\",\"title\":\"Samsung Galaxy S21+ 5G\",\"position\":\"2\"}']";
    public static final String secondItemAddToCompareButton = "//button[@title='Samsung Galaxy S21+ 5G']";
    public static final String compareButton = "//a[normalize-space()='Compare']";
    public static final String quickViewButton ="div[class='infinite-scroll-component gw-products-list'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(3) button:nth-child(2)";
    public static final String closeButton = "//button[@title='devices comparison']";
    public static final String appleLocator = "Apple";
    public static final String buyButton = "//a[@aria-label='Buy iPhone 12 Pro Max']";
    public static final String monthFinance = "body > div:nth-child(34) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > button:nth-child(1)";
    public static final String termFinance = "//body/div[@data-event='load']/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[@role='radiogroup']/div[2]";
    public static final String sortByRatingOptionDropdown = "//*[@id=\"ckmijr6x4000m3a9homgnpmop\"]";
    public static final String reviewsType = "//option[normalize-space()='Most helpful']";
    public static final String compareTab = "//a[normalize-space()='Compare']";
    public static final String compareOptions = "//a[contains(@href,'/wireless-devices/tablets/ipad-compare/')]";
    //public static final String lGVauleAndPerformanceLocator = "//a[normalize-space()='Value + Performance']";
    public static final String lGVauleAndPerformanceLocator = "//a[@href='/wireless-devices/smartphones/lg-affordable-phones/']";
    public static final String buyNowButton = "//a[normalize-space()='Buy now']";
    //public static final String buyNowButton = "//body//div//main[@role='main']//main//section[1]//div[1]//div[1]//div[1]//a[1]";
    public static final String lG = "LG";
    public static final String fullRetailOption = "//span[normalize-space()='Full retail price']";
    public static final String continueButton = "//button[@aria-label='Continue']";
    public static final String zipCodeInputBox = "//*[@aria-label='[object Object] Input Field']";
    public static final String zipCode = "53224";
    public static final String confrimLocationButton = "//button[@aria-label='Confirm Location']";
    //public static final String newCustomerButton ="//button[@aria-label='New Customer']";
    public static final String newCustomerButton ="//*[@id='customer-overlay']/div[3]/div/div/div/div/span/div/div/div/div/div/div[1]/button";
    public static  final String feedbackButton = "//button[@id='nebula_div_btn']";
    public static final String feedBackHandle = "iframe[@title='Feedback Survey']";
    public static final String motorolaLocator = "Motorola";
    public static final String motorlaPageText = "//h2[normalize-space()='Find your moto.']";
    public static final String reviewsLocator = "//a[normalize-space()='30 Reviews']";
    public static final String watchVideoLink = "//*[text()='Watch videos']";
    public static final String chatButton = "//div[@aria-label='Click to chat']";
    public static final String chatBox = "//div[@class='lp_input_area lpc_composer__text-area-wrapper lpc_desktop']";
    public static final String chatText = "Hello";
    public static final String googleLocator = "Google";
    public static final String makeTheSwitchTab = "//a[normalize-space()='Make the Switch']";
    public static final String messageBanner = "//body/div[@class='LPMcontainer LPMoverlay']/div[@data-lp-event='click']/div[1]";
    public static final String accessoriesTab = "//a[@role='menuitem'][normalize-space()='Accessories']";
    public static final String color = "label[for='d_Color0']";
    public static final String categoryButton = "//button[normalize-space()='Category']";
    public static final String categoryOption = "label[for='product.category1']";
    public static final String specialOfferButton = "//button[normalize-space()='Special Offers']";
    public static final String specialOfferOption = "label[for='d_GWDeals0']";
    public static final String compatibleSearchBox = "Compatiblecheck";
    public static final String SearchItem = "Galaxy s21 5G";
    public static final String compatibleSearchItem = "//li[@class='c-list']";
    public static final String amazonLocator = "Amazon";
    public static final String nextButton = "//button[@aria-label='next']";
    public static final String checkAvailabilityButton = "//a[normalize-space()='Check availability']";
    public static final String searchAddressBox = "streetLocusAddress";//id
    public static final String address = "470 Broadway, Berlin, WI, 54923-1320, USA";

    //test class webelements

    //public static final String buyPageVerify = "//h1[normalize-space()='Shop Samsung Galaxy S21 Series Phones']";
    public static final String saveOnSamsungPageHeader = "//h1[normalize-space()='Save on Samsung Galaxy Phones | Shop Today']";
    public static final String brandOptionDisplayed = "//div[normalize-space()='Samsung']";
    public static final String colorOptionDisplayed = "//div[normalize-space()='Purple']";
    public static final String comparePage = "//h1[normalize-space()='Compare Phones & Devices']";
    public static final String quickViewText = "//span[normalize-space()='Galaxy S21 5G']";
    public static final String firstItemCompareText = "//strong[normalize-space()='Not available with 2-Year Contract']";
    public static final String getMoreLocator = "section[id='get-more']";
    public static final String reviews = "//span[normalize-space()='Reviews']";
    public static final String phoneHeader = "//*[text()='LG Stylo™ 6']";
    public static final String pageHeader = "//h1[normalize-space()='Customize your device.']";
    public static final String surveyHeader = "Thank you for sharing your comments. We will use your input to make the website experience better.";
    public static final String recommendText = "//p[normalize-space()='of reviewers recommend this product']";
    public static final String phoneName = "//span[contains(text(),'Motorola one 5G UW')]";
    public static final String messageUs = "//span[@role='heading']";
    public static final String customizeText = "//h1[normalize-space()='Customize your device.']";
    public static final String confirmLocationText = "//*[text()='Confirm Your Location']";
    public static final String accessoriesPageHeader = "//h1[normalize-space()='Phone Accessories - Google']";
    public static final String filterResult = "//div[@role='alert']";
    public static final String compatiblePhoneItemAccessoryHeader = "//h1[normalize-space()='All Accessories for Galaxy S21 5G']";
    public static final String pageHeaderText = "//h1[contains(text(),'See if your address')]";
    public static final String emailAddressBox = "//input[@id='optinEmailAddress']";
    public static final String emailAddress = "moni@gmail.com";
    public static final String searchBoxLocator = "//div[@item-title='all']//div//div//div//div[@item-title='search']";
    public static final String searchBoxItem = "//input[@title='search']";
    public static final String searchBoxInputBox = "//div[@item-title='all']//div//div//div//div[@item-title='search']//div//div[@searchdata='results']//div//input[@name='q']";



}
