package com.gsh.service;

import com.gsh.domain.Chat;
import com.gsh.web.forum.beans.ChatFormBean;

import java.util.List;

public interface ChatService
{
	/**
	 * 发起私信
	 * @param chatFormBean 包含私信内容的FormBean
	 * @param fromUserId 来源用户ID
	 * @param toUserId 去向用户ID
	 */
	public void makeChat(ChatFormBean chatFormBean, Long fromUserId, Long toUserId);

	/**
	 * 通过用户ID查询该用户全部已收到的私信
	 * @param userId 用户ID
	 * @return 保函查询结果的列表,可能为空列表
	 */
	public List<Chat> getRecievedChats(Long userId);

	/**
	 * 将私信标为已读
	 * @param chatId 私信ID
	 */
	public void readChat(Long chatId);

	/**
	 * 将私信标为已删除
	 * @param chatId 私信ID
	 */
	public void deleteChat(Long chatId);

	/**
	 * 查询特定的私信
	 * @param chatId 私信ID
	 * @return 查询得到的私信对象,未查到结果返回值为null
	 */
	public Chat querySingleChat(Long chatId);
}
