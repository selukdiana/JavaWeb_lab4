package by.bsuir.wt.selyuk.tasks.fourth.controller.command.common;

import by.bsuir.wt.selyuk.tasks.fourth.controller.command.Command;
import by.bsuir.wt.selyuk.tasks.fourth.controller.command.CommandResult;
import by.bsuir.wt.selyuk.tasks.fourth.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartLoginCommand implements Command {

    private static final String LOGIN_PAGE = "/WEB-INF/pages/login.jsp";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}
