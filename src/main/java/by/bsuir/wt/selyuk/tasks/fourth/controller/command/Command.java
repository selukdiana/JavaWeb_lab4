package by.bsuir.wt.selyuk.tasks.fourth.controller.command;

import by.bsuir.wt.selyuk.tasks.fourth.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
}
