<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2engine.proto

namespace G2engine;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2engine.WhyEntityByRecordID_V2Request</code>
 */
class WhyEntityByRecordID_V2Request extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string dataSourceCode = 1;</code>
     */
    protected $dataSourceCode = '';
    /**
     * Generated from protobuf field <code>string recordID = 2;</code>
     */
    protected $recordID = '';
    /**
     * Generated from protobuf field <code>int64 flags = 3;</code>
     */
    protected $flags = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $dataSourceCode
     *     @type string $recordID
     *     @type int|string $flags
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Engine::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string dataSourceCode = 1;</code>
     * @return string
     */
    public function getDataSourceCode()
    {
        return $this->dataSourceCode;
    }

    /**
     * Generated from protobuf field <code>string dataSourceCode = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setDataSourceCode($var)
    {
        GPBUtil::checkString($var, True);
        $this->dataSourceCode = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string recordID = 2;</code>
     * @return string
     */
    public function getRecordID()
    {
        return $this->recordID;
    }

    /**
     * Generated from protobuf field <code>string recordID = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setRecordID($var)
    {
        GPBUtil::checkString($var, True);
        $this->recordID = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 flags = 3;</code>
     * @return int|string
     */
    public function getFlags()
    {
        return $this->flags;
    }

    /**
     * Generated from protobuf field <code>int64 flags = 3;</code>
     * @param int|string $var
     * @return $this
     */
    public function setFlags($var)
    {
        GPBUtil::checkInt64($var);
        $this->flags = $var;

        return $this;
    }

}

