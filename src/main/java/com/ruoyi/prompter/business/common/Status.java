
package com.ruoyi.prompter.business.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "服务返回状态VO")
public class Status<T> {
	
	@ApiModelProperty(value = "返回码")
    protected String statusCode;
	
	@ApiModelProperty(value = "返回描述")
    protected String statusMessage;

	@ApiModelProperty(value = "返回数据体")
	protected T data;

	public Status() {
		this(null);
	}

	private Status(T t) {
		this.statusCode = "0";
		this.statusMessage = "success";
		this.data = t;
	}

	private Status(String statusCode, String statusMessage) {
		this(statusCode, statusMessage, null);
	}

	private Status(String statusCode, String statusMessage, T t) {
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.data = t;
	}

	public static <T> Status<T> success(T t) {
		return new Status<>(t);
	}

	public static <T> Status<T> failed(String statusCode, String statusMessage) {
		return new Status<>(statusCode, statusMessage);
	}

	public static <T> Status<T> failed(String statusCode, String statusMessage, T t) {
		return common(statusCode,statusMessage,t);
	}

	/**
	 * 状态
	 * @param statusCode 状态值
	 * @param statusMessage 状态描述
	 * @param t 传输对象
	 * @param <T> 对象泛型
	 * @return
	 */
	public static <T> Status<T> common(String statusCode, String statusMessage, T t) {
		return new Status<>(statusCode, statusMessage, t);
	}

}
