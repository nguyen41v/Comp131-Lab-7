import java.util.Scanner;

class Visitor {

    private String email;
    private String name;
    private String purpose;
    private String phoneNumber;
    private String age;
    private String origin;


    /* Get the visitor's email
     *
     * @returns  The visitor's email
     */
    public String getEmail() {
        return this.email;
    }
    public String getName() {
        return this.name;
    }
    public String getPurpose() {
        return this.purpose;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getOrigin() {
        return this.origin;
    }
    public String getAge() {
        return this.age;
    }

    /* Set the visitor's email
     *
     * @param email  The new email
     * @returns      true if the email is set, false otherwise
     */
    public boolean setEmail(String email) {
        // email is notoriously difficult to validate, so we're not even going to try
        // https://haacked.com/archive/2007/08/21/i-knew-how-to-validate-an-email-address-until-i.aspx/
        if (!email.equals("")) {
            this.email = email;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAge(String age) {
        if (hasOnly(age, "1234567890") && !age.equals("")) {
            this.age = age;
            return true;
        } else {
            return false;
        }
    }

    public boolean setOrigin(String origin) {
        if (hasAnyOf(origin, "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPSDFGHJKLZXCVBNM")) {
            this.origin = origin;
            return true;
        } else {
            return false;
        }
    }


    public boolean setName(String name) {
        if (hasOnly(name, "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPSDFGHJKLZXCVBNM- ") && !name.equals("")) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }
    public boolean setPurpose(String purpose) {
        if (!purpose.equals("")) {
            this.purpose = purpose;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setphoneNumber(String phoneNumber) {
        if (phoneNumber.length() >= 7 && hasAnyOf(phoneNumber, "1234567890") &&  (!hasAnyOf(phoneNumber, "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM!@$%^&="))){
         this.phoneNumber = phoneNumber;
         return true;
        }
        else { return false;}}


    /* Search for characters in a string.
     *
     * @param haystack  The string to be searched through.
     * @param needle    The characters to search for.
     * @returns         True if the haystack contains any needle
     */
    public static boolean hasAnyOf(String haystack, String needles) {
        // check for each undesirable character
        for (int i = 0; i < needles.length(); i++) {
            if (haystack.contains(String.valueOf(needles.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    /* Check for other characters in a string.
     *
     * @param haystack  The string to be searched through.
     * @param needle    The characters to search for.
     * @returns         True if the haystack only contains needles
     */
    public static boolean hasOnly(String haystack, String needles) {
        for (int i = 0; i < haystack.length(); i++) {
            if (!needles.contains(String.valueOf(haystack.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
