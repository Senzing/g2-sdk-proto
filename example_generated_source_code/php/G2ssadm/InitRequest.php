<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2ssadm.proto

namespace G2ssadm;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2ssadm.InitRequest</code>
 */
class InitRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string moduleName = 1;</code>
     */
    protected $moduleName = '';
    /**
     * Generated from protobuf field <code>string iniParams = 2;</code>
     */
    protected $iniParams = '';
    /**
     * Generated from protobuf field <code>int32 verboseLogging = 3;</code>
     */
    protected $verboseLogging = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $moduleName
     *     @type string $iniParams
     *     @type int $verboseLogging
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Ssadm::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string moduleName = 1;</code>
     * @return string
     */
    public function getModuleName()
    {
        return $this->moduleName;
    }

    /**
     * Generated from protobuf field <code>string moduleName = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setModuleName($var)
    {
        GPBUtil::checkString($var, True);
        $this->moduleName = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string iniParams = 2;</code>
     * @return string
     */
    public function getIniParams()
    {
        return $this->iniParams;
    }

    /**
     * Generated from protobuf field <code>string iniParams = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setIniParams($var)
    {
        GPBUtil::checkString($var, True);
        $this->iniParams = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 verboseLogging = 3;</code>
     * @return int
     */
    public function getVerboseLogging()
    {
        return $this->verboseLogging;
    }

    /**
     * Generated from protobuf field <code>int32 verboseLogging = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setVerboseLogging($var)
    {
        GPBUtil::checkInt32($var);
        $this->verboseLogging = $var;

        return $this;
    }

}

