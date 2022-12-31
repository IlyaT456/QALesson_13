package QALesson;

import QALesson.component.ComponentResultForm;
import QALesson.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class RegistrationPageTests extends BaseTest {
    RegistrationPage registrationPage = new RegistrationPage();
    ComponentResultForm componentResultForm = new ComponentResultForm();

    @Test
    public void testForm() {
        registrationPage.openPage()
                .setFirstName("Котофей")
                .setLastName("Тапок")
                .setEmall("TapokKoTof@yandex.ru")
                .setBirthDate("25", "September", "2019")
                .setSex("Male")
                .setUserNumber("8342546385")
                .subjectsInput("English")
                .uploadPicture("src/test/resources/cat.jpg")
                .setHobby("Music")
                .setCurrentAddress("Москва, колбасный завод")
                .setState("NCR")
                .setСity("Delhi")
                .submit();

        componentResultForm.checkTable()
                .checkResult("Student Name", "Котофей Тапок")
                .checkResult("Student Email", "TapokKoTof@yandex.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "8342546385")
                .checkResult("Date of Birth", "25 September,2019")
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Music")
                .checkResult("Picture", "cat.jpg")
                .checkResult("Address", "Москва, колбасный завод")
                .checkResult("State and City", "NCR Delhi");
    }
}
