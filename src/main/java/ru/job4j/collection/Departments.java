package ru.job4j.collection;

import java.util.*;

public class Departments {
    /**
     *  Метод заполняет пропущенные департаменты
     *  Каждое название разбивается на подстроки
     *  Потом собирается снова,
     *  причем при каждом новом добавлении подстроки происходит запись строки во временный Set
     *  После прохождения всех итераций Set преобразуется в List
     * @param deps на вход принимается список строк
     * @return возвращается список строк, в котором устранены пропуски
     */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            StringBuilder start = new StringBuilder();
            for (String el : value.split("/")) {
                start.append("/").append(el);
                tmp.add(start.substring(1));
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
