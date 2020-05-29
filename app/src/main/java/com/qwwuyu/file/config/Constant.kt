package com.qwwuyu.file.config

object Constant {
    /* ========================  ======================== */
    const val INTENT_CLOSE = "INTENT_CLOSE"

    /* ======================== response code ======================== */
    /** 处理请求成功  */
    const val HTTP_SUC = 1

    /** 处理请求失败  */
    const val HTTP_ERR = -1

    /* ======================== 接口 ======================== */
    const val URL_QUERY = "/i/query"
    const val URL_DEL = "/i/del"
    const val URL_DEL_DIR = "/i/delDir"
    const val URL_DOWNLOAD = "/i/download"
    const val URL_OPEN = "/i/open"
    const val UPL_UPLOAD = "/i/upload"
    const val UPL_CREATE_DIR = "/i/createDir"

    /* ======================== SP ======================== */
    const val SP_SHOW_POINT_FILE = "SP_SHOW_POINT_FILE"
}