<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2config.proto

namespace G2config;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2config.DeleteDataSourceRequest</code>
 */
class DeleteDataSourceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 configHandle = 1;</code>
     */
    protected $configHandle = 0;
    /**
     * Generated from protobuf field <code>string inputJson = 2;</code>
     */
    protected $inputJson = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $configHandle
     *     @type string $inputJson
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Config::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 configHandle = 1;</code>
     * @return int|string
     */
    public function getConfigHandle()
    {
        return $this->configHandle;
    }

    /**
     * Generated from protobuf field <code>int64 configHandle = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setConfigHandle($var)
    {
        GPBUtil::checkInt64($var);
        $this->configHandle = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string inputJson = 2;</code>
     * @return string
     */
    public function getInputJson()
    {
        return $this->inputJson;
    }

    /**
     * Generated from protobuf field <code>string inputJson = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setInputJson($var)
    {
        GPBUtil::checkString($var, True);
        $this->inputJson = $var;

        return $this;
    }

}

