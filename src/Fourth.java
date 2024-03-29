/*Задание №4:
Дана скобочная последовательность: [((())()(())]]
        - Можно ли считать эту последовательность правильной?
        - Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить,
чтоб она стала правильной?

Ответ:
"(())()(())" - последовательность правильная. Если к ней добавить "(]" получится неправильная последовательность,
т.к. согласно второго правила "правильная скобочная последовательность, взятая в скобки одного типа -
правильная скобочная последовательность". Соответственно, раз скобки разного типа, получаем неправильную последовательность.
Чтобы получить правильную последовательность скобки должны иметь одинаковый тип.

Правильные варианты:
        [[(())()(())]]
        [((())()(()))]
*/

