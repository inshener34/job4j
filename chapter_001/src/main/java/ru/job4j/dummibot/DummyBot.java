package ru.job4j.dummibot;

public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        DummyBot bot = new DummyBot();
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if  ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
